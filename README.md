# DeepGameBooster
Android app to boost device profiles via shell commands.
- MVVM, Hilt, Jetpack Compose, Firebase (free features), Coroutines.
- Shell execution via Shizuku/root/safe fallback.
- Profiles for Battery Saver, Balanced, Performance + custom.
- Firebase: Analytics, Remote Config, Crashlytics, Firestore (no Auth).

## Setup

1. Add your `google-services.json` to `app/`.
2. Add Firebase dependencies in `app/build.gradle`.
3. (Optional) Add Shizuku SDK for shell execution.
4. Sync project and run!

## Safety

- All shell commands require user confirmation.
- Dangerous commands show warnings.
- Rollback available in Settings.

## Mock Mode

App runs with mock data until Firebase is configured.