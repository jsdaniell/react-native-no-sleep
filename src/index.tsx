import NoSleep from './NativeNoSleep';

export function activateKeepAwake(): void {
  NoSleep.activate();
}

export function deactivateKeepAwake(): void {
  NoSleep.deactivate();
}