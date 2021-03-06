package com.example.jactpack_hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

//ApplicationComponent is Deprecated in Dagger Version 2.30
//ApplicationComponent removed in Dagger Version 2.31
//Alternatively SingletonComponent should be used instead of ApplicationComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    //here is structure how many dependencies that i want to inject, like retrofit, room,...etc
    //use inject dependency we don't have to construct every object over and over again
    //for simple injection demo, I use a string as dependency to do injection
    //if don't use @Singleton annotation every time do inject it will create new instance.
    @Singleton
    @Provides
    @Named("Dependency1")
    fun provideTestString1() = "This is first string injected"

    /*
    *  Q:If have many dependencies how can we know that which dependencies is used?
    *  A:can using @Named annotation to specific each dependency have unique name
    * */

    @Singleton
    @Provides
    @Named("Dependency2")
    fun provideTestString2() = "This is second string injected"

}