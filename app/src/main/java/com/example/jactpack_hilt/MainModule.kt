package com.example.jactpack_hilt

import android.content.Context
import android.content.res.Resources
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton


@Module
@InstallIn(ActivityComponent::class)
object MainModule {

    /*
    * the @Singleton doesn't work here
    * because we Install in ActivityComponent, it's "activity" should not have singleton
    * so have to change to @ActivityScoped
    * */
    //@Singleton

    @ActivityScoped
    @Provides
    @Named("Dependency3")
    fun provideTestString3() = "This is third string injected"


    //if the inject object needs context
    //the context needs to annotate @ApplicationContext,
    //then go to MyApplication class which that had annotated @HiltAndroidApp
    @ActivityScoped
    @Provides
    @Named("Dependency4")
    fun provideTestString4(
        @ApplicationContext
        context: Context
    ) = context.getString(R.string.string_to_inject)


    //if this dependency before it created, needs other dependencies to help construct.
    //so we can use @Named annotation to get other inject instance
    @ActivityScoped
    @Provides
    @Named("Dependency5")
    fun provideTestString5(
        @ApplicationContext
        context: Context,
        @Named("Dependency1")
        otherString:String
    ) = "${context.getString(R.string.string_to_inject)} -> $otherString"

}