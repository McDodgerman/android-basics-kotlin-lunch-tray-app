
ñ
\
MenuContentTestscom.example.lunchtrayside_menu_item_content2Šôº˜€Ã—Ú:‹ôº˜€©¼ç
 java.lang.IllegalStateException: Can not perform this action after onSaveInstanceState
at androidx.fragment.app.FragmentManager.checkStateLoss(FragmentManager.java:1551)
at androidx.fragment.app.FragmentManager.ensureExecReady(FragmentManager.java:1652)
at androidx.fragment.app.FragmentManager.execSingleAction(FragmentManager.java:1666)
at androidx.fragment.app.BackStackRecord.commitNow(BackStackRecord.java:317)
at androidx.fragment.app.testing.FragmentScenario$Companion.internalLaunch$lambda-2(FragmentScenario.kt:628)
at androidx.fragment.app.testing.FragmentScenario$Companion.$r8$lambda$qQn68eFQCuWOFZCsJdZ7z8QDNvM(Unknown Source:0)
at androidx.fragment.app.testing.FragmentScenario$Companion$$ExternalSyntheticLambda0.perform(Unknown Source:13)
at androidx.test.core.app.ActivityScenario.lambda$onActivity$2$ActivityScenario(ActivityScenario.java:660)
at androidx.test.core.app.ActivityScenario$$Lambda$4.run(ActivityScenario.java:652)
at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:462)
at java.util.concurrent.FutureTask.run(FutureTask.java:266)
at android.app.Instrumentation$SyncRunnable.run(Instrumentation.java:2414)
at android.os.Handler.handleCallback(Handler.java:938)
at android.os.Handler.dispatchMessage(Handler.java:99)
at android.os.Looper.loop(Looper.java:233)
at android.app.ActivityThread.main(ActivityThread.java:8068)
at java.lang.reflect.Method.invoke(Native Method)
at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:631)
at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:978)java.lang.IllegalStateException java.lang.IllegalStateException: Can not perform this action after onSaveInstanceState
at androidx.fragment.app.FragmentManager.checkStateLoss(FragmentManager.java:1551)
at androidx.fragment.app.FragmentManager.ensureExecReady(FragmentManager.java:1652)
at androidx.fragment.app.FragmentManager.execSingleAction(FragmentManager.java:1666)
at androidx.fragment.app.BackStackRecord.commitNow(BackStackRecord.java:317)
at androidx.fragment.app.testing.FragmentScenario$Companion.internalLaunch$lambda-2(FragmentScenario.kt:628)
at androidx.fragment.app.testing.FragmentScenario$Companion.$r8$lambda$qQn68eFQCuWOFZCsJdZ7z8QDNvM(Unknown Source:0)
at androidx.fragment.app.testing.FragmentScenario$Companion$$ExternalSyntheticLambda0.perform(Unknown Source:13)
at androidx.test.core.app.ActivityScenario.lambda$onActivity$2$ActivityScenario(ActivityScenario.java:660)
at androidx.test.core.app.ActivityScenario$$Lambda$4.run(ActivityScenario.java:652)
at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:462)
at java.util.concurrent.FutureTask.run(FutureTask.java:266)
at android.app.Instrumentation$SyncRunnable.run(Instrumentation.java:2414)
at android.os.Handler.handleCallback(Handler.java:938)
at android.os.Handler.dispatchMessage(Handler.java:99)
at android.os.Looper.loop(Looper.java:233)
at android.app.ActivityThread.main(ActivityThread.java:8068)
at java.lang.reflect.Method.invoke(Native Method)
at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:631)
at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:978)"î

logcatandroidØ
ÕC:\Users\lxngu\AndroidStudioProjects\android-basics-kotlin-lunch-tray-app\app\build\outputs\androidTest-results\connected\ONEPLUS A6003 - 11\logcat-com.example.lunchtray.MenuContentTests-side_menu_item_content.txt"¹

device-infoandroidž
›C:\Users\lxngu\AndroidStudioProjects\android-basics-kotlin-lunch-tray-app\app\build\outputs\androidTest-results\connected\ONEPLUS A6003 - 11\device-info.pb"º

device-info.meminfoandroid—
”C:\Users\lxngu\AndroidStudioProjects\android-basics-kotlin-lunch-tray-app\app\build\outputs\androidTest-results\connected\ONEPLUS A6003 - 11\meminfo"º

device-info.cpuinfoandroid—
”C:\Users\lxngu\AndroidStudioProjects\android-basics-kotlin-lunch-tray-app\app\build\outputs\androidTest-results\connected\ONEPLUS A6003 - 11\cpuinfoò
]
MenuContentTestscom.example.lunchtrayentree_menu_item_content2‹ôº˜€æ¿3:¬ôº˜€·Š<å
Öandroidx.test.espresso.NoActivityResumedException: No activities in stage RESUMED. Did you forget to launch the activity. (test.getActivity() or similar)?
at dalvik.system.VMStack.getThreadStackTrace(Native Method)
at java.lang.Thread.getStackTrace(Thread.java:1736)
at androidx.test.espresso.base.DefaultFailureHandler.getUserFriendlyError(DefaultFailureHandler.java:12)
at androidx.test.espresso.base.DefaultFailureHandler.handle(DefaultFailureHandler.java:7)
at androidx.test.espresso.ViewInteraction.waitForAndHandleInteractionResults(ViewInteraction.java:8)
at androidx.test.espresso.ViewInteraction.check(ViewInteraction.java:12)
at com.example.lunchtray.MenuContentTests.entree_menu_item_content(MenuContentTests.kt:49)1androidx.test.espresso.NoActivityResumedExceptionÖandroidx.test.espresso.NoActivityResumedException: No activities in stage RESUMED. Did you forget to launch the activity. (test.getActivity() or similar)?
at dalvik.system.VMStack.getThreadStackTrace(Native Method)
at java.lang.Thread.getStackTrace(Thread.java:1736)
at androidx.test.espresso.base.DefaultFailureHandler.getUserFriendlyError(DefaultFailureHandler.java:12)
at androidx.test.espresso.base.DefaultFailureHandler.handle(DefaultFailureHandler.java:7)
at androidx.test.espresso.ViewInteraction.waitForAndHandleInteractionResults(ViewInteraction.java:8)
at androidx.test.espresso.ViewInteraction.check(ViewInteraction.java:12)
at com.example.lunchtray.MenuContentTests.entree_menu_item_content(MenuContentTests.kt:49)"ð

logcatandroidÚ
×C:\Users\lxngu\AndroidStudioProjects\android-basics-kotlin-lunch-tray-app\app\build\outputs\androidTest-results\connected\ONEPLUS A6003 - 11\logcat-com.example.lunchtray.MenuContentTests-entree_menu_item_content.txt"¹

device-infoandroidž
›C:\Users\lxngu\AndroidStudioProjects\android-basics-kotlin-lunch-tray-app\app\build\outputs\androidTest-results\connected\ONEPLUS A6003 - 11\device-info.pb"º

device-info.meminfoandroid—
”C:\Users\lxngu\AndroidStudioProjects\android-basics-kotlin-lunch-tray-app\app\build\outputs\androidTest-results\connected\ONEPLUS A6003 - 11\meminfo"º

device-info.cpuinfoandroid—
”C:\Users\lxngu\AndroidStudioProjects\android-basics-kotlin-lunch-tray-app\app\build\outputs\androidTest-results\connected\ONEPLUS A6003 - 11\cpuinfoƒ 
e
MenuContentTestscom.example.lunchtrayaccompaniment_menu_item_content2¬ôº˜€¬½H:¬ôº˜ÀÒ˜Ôç
 java.lang.IllegalStateException: Can not perform this action after onSaveInstanceState
at androidx.fragment.app.FragmentManager.checkStateLoss(FragmentManager.java:1551)
at androidx.fragment.app.FragmentManager.ensureExecReady(FragmentManager.java:1652)
at androidx.fragment.app.FragmentManager.execSingleAction(FragmentManager.java:1666)
at androidx.fragment.app.BackStackRecord.commitNow(BackStackRecord.java:317)
at androidx.fragment.app.testing.FragmentScenario$Companion.internalLaunch$lambda-2(FragmentScenario.kt:628)
at androidx.fragment.app.testing.FragmentScenario$Companion.$r8$lambda$qQn68eFQCuWOFZCsJdZ7z8QDNvM(Unknown Source:0)
at androidx.fragment.app.testing.FragmentScenario$Companion$$ExternalSyntheticLambda0.perform(Unknown Source:13)
at androidx.test.core.app.ActivityScenario.lambda$onActivity$2$ActivityScenario(ActivityScenario.java:660)
at androidx.test.core.app.ActivityScenario$$Lambda$4.run(ActivityScenario.java:652)
at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:462)
at java.util.concurrent.FutureTask.run(FutureTask.java:266)
at android.app.Instrumentation$SyncRunnable.run(Instrumentation.java:2414)
at android.os.Handler.handleCallback(Handler.java:938)
at android.os.Handler.dispatchMessage(Handler.java:99)
at android.os.Looper.loop(Looper.java:233)
at android.app.ActivityThread.main(ActivityThread.java:8068)
at java.lang.reflect.Method.invoke(Native Method)
at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:631)
at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:978)java.lang.IllegalStateException java.lang.IllegalStateException: Can not perform this action after onSaveInstanceState
at androidx.fragment.app.FragmentManager.checkStateLoss(FragmentManager.java:1551)
at androidx.fragment.app.FragmentManager.ensureExecReady(FragmentManager.java:1652)
at androidx.fragment.app.FragmentManager.execSingleAction(FragmentManager.java:1666)
at androidx.fragment.app.BackStackRecord.commitNow(BackStackRecord.java:317)
at androidx.fragment.app.testing.FragmentScenario$Companion.internalLaunch$lambda-2(FragmentScenario.kt:628)
at androidx.fragment.app.testing.FragmentScenario$Companion.$r8$lambda$qQn68eFQCuWOFZCsJdZ7z8QDNvM(Unknown Source:0)
at androidx.fragment.app.testing.FragmentScenario$Companion$$ExternalSyntheticLambda0.perform(Unknown Source:13)
at androidx.test.core.app.ActivityScenario.lambda$onActivity$2$ActivityScenario(ActivityScenario.java:660)
at androidx.test.core.app.ActivityScenario$$Lambda$4.run(ActivityScenario.java:652)
at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:462)
at java.util.concurrent.FutureTask.run(FutureTask.java:266)
at android.app.Instrumentation$SyncRunnable.run(Instrumentation.java:2414)
at android.os.Handler.handleCallback(Handler.java:938)
at android.os.Handler.dispatchMessage(Handler.java:99)
at android.os.Looper.loop(Looper.java:233)
at android.app.ActivityThread.main(ActivityThread.java:8068)
at java.lang.reflect.Method.invoke(Native Method)
at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:631)
at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:978)"÷

logcatandroidá
ÞC:\Users\lxngu\AndroidStudioProjects\android-basics-kotlin-lunch-tray-app\app\build\outputs\androidTest-results\connected\ONEPLUS A6003 - 11\logcat-com.example.lunchtray.MenuContentTests-accompaniment_menu_item_content.txt"¹

device-infoandroidž
›C:\Users\lxngu\AndroidStudioProjects\android-basics-kotlin-lunch-tray-app\app\build\outputs\androidTest-results\connected\ONEPLUS A6003 - 11\device-info.pb"º

device-info.meminfoandroid—
”C:\Users\lxngu\AndroidStudioProjects\android-basics-kotlin-lunch-tray-app\app\build\outputs\androidTest-results\connected\ONEPLUS A6003 - 11\meminfo"º

device-info.cpuinfoandroid—
”C:\Users\lxngu\AndroidStudioProjects\android-basics-kotlin-lunch-tray-app\app\build\outputs\androidTest-results\connected\ONEPLUS A6003 - 11\cpuinfo*ž
c
test-results.logOcom.google.testing.platform.runtime.android.driver.AndroidInstrumentationDriver¨
¥C:\Users\lxngu\AndroidStudioProjects\android-basics-kotlin-lunch-tray-app\app\build\outputs\androidTest-results\connected\ONEPLUS A6003 - 11\testlog\test-results.log 2
text/plain