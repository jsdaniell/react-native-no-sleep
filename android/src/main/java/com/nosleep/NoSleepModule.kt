package com.nosleep

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.annotations.ReactModule

@ReactModule(name = NoSleepModule.NAME)
class NoSleepModule(reactContext: ReactApplicationContext) :
  NativeNoSleepSpec(reactContext) {

  override fun getName(): String {
    return NAME
  }

  @ReactMethod
    fun activate() {
        currentActivity?.runOnUiThread {
            it.window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        }
    }

    @ReactMethod
    fun deactivate() {
        currentActivity?.runOnUiThread {
            it.window.clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        }
    }

  companion object {
    const val NAME = "NoSleep"
  }
}
