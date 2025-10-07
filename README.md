# RestroManager (Order Receiver)

A desktop application for restaurant order management built with Java Swing, themed with FlatLaf, and bundled with sample resources/data in the `resource` folder.

## Features

- Tabbed interface for Menu, Cart, Order Manager, Add/Remove Items, and Summary
- FlatLaf look-and-feel for modern UI
- Menu data and temporary logs stored under `resource/restaurant_log`

## Folder Structure

- `resource/` source code and UI form files
- `lib/` required libraries (FlatLaf, Apache POI, etc.) and font `SukhumvitSet-Light.ttf`
- `nbproject/` NetBeans project files (if present)
- `build.xml` Ant build script (NetBeans/Ant project)
- `manifest.mf` Jar/Manifest settings (if used)

## Requirements

- Java JDK 8+ (JDK 11 or newer recommended)
- NetBeans (recommended) or an IDE/tooling with Ant support

## Run

Recommended via NetBeans:

- Open this project folder in NetBeans
- Run the main class: `main.Main` (located at `resource/main/Main.java`)

Notes:

- The app relies on font `lib/SukhumvitSet-Light.ttf` and icons in `resource/ImageFolder`
- If you plan to build with Ant, open the project in NetBeans. The provided `build.xml` imports `nbproject/build-impl.xml`, which NetBeans generates/maintains

## Used Libraries (partial)

- FlatLaf (`lib/flatlaf-*.jar`)
- Apache POI (`lib/poi-*.jar`, `lib/poi-ooxml-*.jar`, etc.)
- Apache Commons (`lib/commons-*.jar`)

## License

This project is licensed under the MIT License — see `LICENSE` for details

## Authors/Credits

- Based on source headers: `meama`
