# @jsdaniell/react-native-no-sleep

[![npm version](https://img.shields.io/npm/v/@jsdaniell/react-native-no-sleep.svg)](https://www.npmjs.com/package/@jsdaniell/react-native-no-sleep)
[![License](https://img.shields.io/npm/l/@jsdaniell/react-native-no-sleep.svg)](https://github.com/jsdaniell/react-native-no-sleep/blob/main/LICENSE)

Library to keep screen awake on React Native, working on iOS and Android.

## Features

- Prevents the screen from sleeping on both iOS and Android devices.
- Lightweight and easy to use.

## Installation

```bash
npm install @jsdaniell/react-native-no-sleep
```

or

```bash
yarn add @jsdaniell/react-native-no-sleep
```

## Usage

```javascript
import { activateKeepAwake, deactivateKeepAwake } from '@jsdaniell/react-native-no-sleep';

// To activate (keep the screen awake)
activateKeepAwake();

// To deactivate (allow the screen to sleep)
deactivateKeepAwake();
```

## API

### `activateKeepAwake()`

Activates the library, preventing the screen from sleeping.

### `deactivateKeepAwake()`

Deactivates the library, allowing the screen to sleep as usual.

## Contributing

Contributions are welcome! Please see the [CONTRIBUTING.md](https://github.com/jsdaniell/react-native-no-sleep/blob/main/CONTRIBUTING.md) file for more information.

## License

This project is licensed under the MIT License - see the [LICENSE](https://github.com/jsdaniell/react-native-no-sleep/blob/main/LICENSE) file for details.
