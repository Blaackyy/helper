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

##### [`helper-sql`](https://github.com/lucko/helper/tree/master/helper-sql): Provides SQL datasources using HikariCP.
[![Artifact](https://img.shields.io/badge/build-artifact-brightgreen.svg)](https://ci.lucko.me/job/helper/lastSuccessfulBuild/artifact/helper-sql/target/helper-sql.jar) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/me.lucko/helper-sql/badge.svg)](https://maven-badges.herokuapp.com/maven-central/me.lucko/helper-sql) [![Javadocs](https://javadoc.io/badge/me.lucko/helper-sql.svg)](https://javadoc.io/doc/me.lucko/helper-sql)

##### [`helper-redis`](https://github.com/lucko/helper/tree/master/helper-redis): Provides Redis clients and implements the helper Messaging system using Jedis.
[![Artifact](https://img.shields.io/badge/build-artifact-brightgreen.svg)](https://ci.lucko.me/job/helper/lastSuccessfulBuild/artifact/helper-redis/target/helper-redis.jar) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/me.lucko/helper-redis/badge.svg)](https://maven-badges.herokuapp.com/maven-central/me.lucko/helper-redis) [![Javadocs](https://javadoc.io/badge/me.lucko/helper-redis.svg)](https://javadoc.io/doc/me.lucko/helper-redis)

##### [`helper-mongo`](https://github.com/lucko/helper/tree/master/helper-mongo): Provides MongoDB datasources.
[![Artifact](https://img.shields.io/badge/build-artifact-brightgreen.svg)](https://ci.lucko.me/job/helper/lastSuccessfulBuild/artifact/helper-mongo/target/helper-mongo.jar) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/me.lucko/helper-mongo/badge.svg)](https://maven-badges.herokuapp.com/maven-central/me.lucko/helper-mongo) [![Javadocs](https://javadoc.io/badge/me.lucko/helper-mongo.svg)](https://javadoc.io/doc/me.lucko/helper-mongo)

##### [`helper-lilypad`](https://github.com/lucko/helper/tree/master/helper-lilypad): Implements the helper Messaging system using LilyPad.
[![Artifact](https://img.shields.io/badge/build-artifact-brightgreen.svg)](https://ci.lucko.me/job/helper/lastSuccessfulBuild/artifact/helper-lilypad/target/helper-lilypad.jar) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/me.lucko/helper-lilypad/badge.svg)](https://maven-badges.herokuapp.com/maven-central/me.lucko/helper-lilypad) [![Javadocs](https://javadoc.io/badge/me.lucko/helper-lilypad.svg)](https://javadoc.io/doc/me.lucko/helper-lilypad)

##### [`helper-profiles`](https://github.com/lucko/helper/tree/master/helper-profiles): Provides a cached lookup service for player profiles.
[![Artifact](https://img.shields.io/badge/build-artifact-brightgreen.svg)](https://ci.lucko.me/job/helper/lastSuccessfulBuild/artifact/helper-profiles/target/helper-profiles.jar) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/me.lucko/helper-profiles/badge.svg)](https://maven-badges.herokuapp.com/maven-central/me.lucko/helper-profiles) [![Javadocs](https://javadoc.io/badge/me.lucko/helper-profiles.svg)](https://javadoc.io/doc/me.lucko/helper-profiles)

##### [`helper-js`](https://github.com/lucko/helper/tree/master/helper-js): JavaScript plugins using Nashorn.
[![Artifact](https://img.shields.io/badge/build-artifact-brightgreen.svg)](https://ci.lucko.me/job/helper/lastSuccessfulBuild/artifact/helper-js/target/helper-js.jar) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/me.lucko/helper-js/badge.svg)](https://maven-badges.herokuapp.com/maven-central/me.lucko/helper-js) [![Javadocs](https://javadoc.io/badge/me.lucko/helper-js.svg)](https://javadoc.io/doc/me.lucko/helper-js)

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