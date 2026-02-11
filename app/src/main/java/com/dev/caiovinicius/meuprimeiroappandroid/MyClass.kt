package com.dev.caiovinicius.meuprimeiroappandroid

import android.content.Context
import java.lang.ref.WeakReference

class MyClass(val context: Context) {
    // ...

    val contextWeakReference = WeakReference(context)

    fun doSomething() {
        contextWeakReference.get()
    }

}