package com.neodtech.elclima.di


import com.neodtech.elclima.repository.WeatherRepository
import com.neodtech.elclima.repository.WeatherRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun weatherRepository(repo : WeatherRepositoryImpl) : WeatherRepository
}
//MockRespository testing
//class MockRepository : WeatherRepository {
//    override suspend fun getWeatherCity(): Weather {
//        return Weather("Cloud","rain")
//    }
//}