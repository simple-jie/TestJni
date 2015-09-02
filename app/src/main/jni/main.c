#include "com_example_jxb_testjni_TestJni.h"

JNIEXPORT jstring JNICALL Java_com_example_jxb_testjni_TestJni_getString
  (JNIEnv * env, jobject obj){
     return (*env)->NewStringUTF(env,"I'm comes from to Native Function!");
  }