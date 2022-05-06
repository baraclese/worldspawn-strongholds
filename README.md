# worldspawn-strongholds

A Minecraft 1.6.4 legacy fabric mod that will make strongholds generate around world spawn instead of (0, 0).

This is useful if you want to set your world spawn manually and possibly far away from (0, 0).

Run `./gradlew` to build.

## Limitations

This mod is very limited in its scope. You cannot have more than three strongholds in older minecraft versions and this mod does not work around that limitation. That means if you have already generated three strongholds and then change your world spawn this mod will not have any effect. Otherwise if you create a new world that hasn't been explored yet and set a custom world spawn the mod will work just fine including throwing Eye Of Enders to locate the strongholds.
