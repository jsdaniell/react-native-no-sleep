#import "NoSleep.h"

@implementation NoSleep
RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(activate) {
  dispatch_async(dispatch_get_main_queue(), ^{
    [UIApplication sharedApplication].idleTimerDisabled = YES;
  });
}

RCT_EXPORT_METHOD(deactivate) {
  dispatch_async(dispatch_get_main_queue(), ^{
    [UIApplication sharedApplication].idleTimerDisabled = NO;
  });
}

- (std::shared_ptr<facebook::react::TurboModule>)getTurboModule:
    (const facebook::react::ObjCTurboModule::InitParams &)params
{
    return std::make_shared<facebook::react::NativeNoSleepSpecJSI>(params);
}

@end
