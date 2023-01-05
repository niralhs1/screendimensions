fastlane documentation
----

# Installation

Make sure you have the latest version of the Xcode command line tools installed:

```sh
xcode-select --install
```

For _fastlane_ installation instructions, see [Installing _fastlane_](https://docs.fastlane.tools/#installing-fastlane)

# Available Actions

## Android

### android rollout_internal

```sh
[bundle exec] fastlane android rollout_internal
```

Rollout app to internal channel Usage:fastlane android rollout_internal aab:'path-to.aab' rollout:0.25

### android rollout_alpha

```sh
[bundle exec] fastlane android rollout_alpha
```

Roll out app to Alpha channel - Usage:fastlane android rollout_alpha aab:'path-to-verson.aab' rollout:1

### android update_rollout_alpha

```sh
[bundle exec] fastlane android update_rollout_alpha
```

Roll out app to Alpha channel - Usage:fastlane android rollout_alpha aab:'path-to-verson.aab' rollout:1

### android promote_alpha_to_prod

```sh
[bundle exec] fastlane android promote_alpha_to_prod
```

Promote alpha app to Production - Usage:fastlane android promote_alpha_to_prod

### android rollout_production

```sh
[bundle exec] fastlane android rollout_production
```

Roll out app to Production channel - Usage:fastlane android rollout_production aab:'path-to-verson.aab' rollout:0.25

### android promote_production_to_prod

```sh
[bundle exec] fastlane android promote_production_to_prod
```

Promote/Publish production app to Production - Usage:fastlane android promote_producion_to_prod

### android get_track_version_codes

```sh
[bundle exec] fastlane android get_track_version_codes
```

Get VersionCodes  - Usage:fastlane android get_track_version_codes

### android get_track_release_names

```sh
[bundle exec] fastlane android get_track_release_names
```

Get Release Names  - Usage:fastlane android get_track_version_codes

----

This README.md is auto-generated and will be re-generated every time [_fastlane_](https://fastlane.tools) is run.

More information about _fastlane_ can be found on [fastlane.tools](https://fastlane.tools).

The documentation of _fastlane_ can be found on [docs.fastlane.tools](https://docs.fastlane.tools).
