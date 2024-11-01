![](https://i.imgur.com/zllxTFp.png "Banner")
# helper [![Build Status](https://ci.lucko.me/job/helper/badge/icon)](https://ci.lucko.me/job/helper/) [![Discord](https://img.shields.io/badge/chat-on%20discord-blue.svg)](https://discord.gg/Rnbpc7s)

helper is a development toolkit / library for Bukkit plugin developers. It provides a number of utilities and extended APIs which help to reduce boilerplate code and offer alternative paradigms for creating content.

#### History

💡 helper started off as a library to experiment with an alternative paradigm for creating [event listeners](https://github.com/lucko/helper/wiki/helper:-Events). Over time, more functionality has been added, usually as a response to a specific development need as I completed freelance work.

🌍 I don't use helper in any of my public projects - it's quite a big library, and I don't like to add bloat unnecessarily!

✅ However, it has been used extensively in a number of private server projects, most notably, in most custom plugins on servers operated by [Voldex Games](https://voldex.net/) (TheArchon, PrimeMC, etc). I'm also aware of a number of other developers / development teams who still actively use helper, which is awesome!

#### Status

I'm no longer actively working on further API additions, but the project is still being used frequently by various development teams, and I accept pull requests!

### Links

* [**Download**](https://ci.lucko.me/job/helper/) (download links for the standalone helper plugins)
* [**Wiki**](https://github.com/lucko/helper/wiki/) (*almost-fully-complete* documentation for helper)


### Modules
##### [`helper`](https://github.com/lucko/helper/tree/master/helper): The main helper project
[![Artifact](https://img.shields.io/badge/build-artifact-brightgreen.svg)](https://ci.lucko.me/job/helper/lastSuccessfulBuild/artifact/helper/target/helper.jar) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/me.lucko/helper/badge.svg)](https://maven-badges.herokuapp.com/maven-central/me.lucko/helper) [![Javadocs](https://javadoc.io/badge/me.lucko/helper.svg)](https://javadoc.io/doc/me.lucko/helper)

## Feature Overview

* [`Events`](https://github.com/lucko/helper/wiki/helper:-Events) - functional event handling and flexible listener registration
* [`Scheduler`](https://github.com/lucko/helper/wiki/helper:-Scheduler) - easy access to the Bukkit scheduler
* [`Promise`](https://github.com/lucko/helper/wiki/helper:-Promise) - a chain of operations (Futures) executing between both sync and async threads
* [`Random`](https://github.com/lucko/helper/wiki/helper:-Random) - make random selections from collections of weighted elements
* [`Bucket`](https://github.com/lucko/helper/wiki/helper:-Bucket) - sets of distributed and uniformly partitioned elements
* [`Terminables`](https://github.com/lucko/helper/wiki/helper:-Terminables) - a family of interfaces to help easily manipulate objects which can be unregistered, stopped, or gracefully halted

## Changes

1. Use paperweight
2. Use gradle
3. Debloat stuff we already can do with paper api
4. Folia compatible using [CJCrafter's Schedulers library](https://github.com/CJCrafter/FoliaScheduler).
5. Do not shade stuff the server already provides