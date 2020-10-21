
# Latte

[Latte] is a plugin for [Gradle] providing language support for
[OpenEdge ABL][openedge]. It provides gradle tasks to compile ABL code
and run unit tests using ABLUnit. All the hard work is done by [PCT],
thanks to gradle's fantastic integration with [Ant].

## Usage

[Latte] is hosted in the [Gradle Plugin Portal] so you
can use it by just adding this to your `build.gradle`:

```groovy
plugins {
  id "oe.espresso.latte" version "0.3.1"
}
```

This will add [PCT][] tasks and types to your project and integrate
[PCT] with [Gradle] lifecycle tasks. It does this by modifying the
[Gradle] project model.


## Contributing

Want to suggest a feature or report a bug? Head to [issue tracker][issues].

Code contributions are very welcome, please check out [hacking][] notes.

## License

latte is a free and open-source software licensed under the
[Apache License 2.0](https://github.com/espresso-latte/latte/LICENSE)

[gradle]: https://gradle.org/
[openedge]: https://www.progress.com/openedge
[latte]: https://github.com/espresso-latte/latte
[pct]: https://github.com/Riverside-Software/pct
[issues]: https://github.com/espresso-latte/latte/issues
[hacking]: HACKING.md
[grportal-grabl]: https://plugins.gradle.org/plugin/oe.espresso.latte
[grportal-grabl-base]: https://plugins.gradle.org/plugin/oe.espresso.latte-base
