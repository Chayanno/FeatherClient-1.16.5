# FeatherClient 1.16.5

**Ultra-Lightweight Minecraft Client with Professional HUD** ⚡

A high-performance Minecraft client mod for 1.16.5 optimized for low-end PCs. Feather Client features a beautiful, professional GUI similar to the original Feather Client with multiple HUD modules and advanced performance optimizations.

## ✨ Features

### Built-in HUD Modules
- 📊 **FPS Display** - Real-time FPS counter with color coding (Green: 60+, Yellow: 30-60, Red: <30)
- ⌨️ **Keystrokes** - WASD + Space visual display with press/release animation
- 🧪 **Potion Effects** - Shows active status effects, amplifier, and duration
- 🛡️ **Armor Display** - Shows armor piece durability
- 📍 **Coordinates** - Real-time X, Y, Z position tracking
- ⏰ **Clock** - Real-time display
- 🌐 **Ping Display** - Server latency indicator

### Performance Optimizations
- 🚀 Reduced particle rendering (10% spawn rate)
- 📉 Optimized entity rendering
- 🎯 Efficient chunk updates
- 💾 Low memory footprint
- ⚙️ Minimal CPU/GPU usage

### GUI Features
- 🎨 Feather Client style theme
- 📦 Drag-and-drop HUD positioning
- ⚙️ Easy toggle for each module
- 🎯 Professional UI design

## 📋 System Requirements

- **Minimum RAM:** 512MB (for Minecraft + Client)
- **Processor:** Dual-core 2GHz+
- **Storage:** 100MB free space
- **Java:** Java 8 or higher
- **Minecraft Version:** 1.16.5 (Cracked Compatible)

## 🚀 Installation

### Quick Setup
1. Download **Fabric Loader** for Minecraft 1.16.5
2. Download the latest release from [Releases](https://github.com/Chayanno/FeatherClient-1.16.5/releases)
3. Place the `.jar` file in `.minecraft/mods/`
4. Launch Minecraft with Fabric profile

### Build from Source
```bash
git clone https://github.com/Chayanno/FeatherClient-1.16.5.git
cd FeatherClient-1.16.5
./gradlew build
```

The compiled mod will be in `build/libs/featherclient-1.0.0.jar`

## ⚙️ Configuration

Edit HUD module positions and toggle them on/off:
- Each module can be independently enabled/disabled
- Positions are customizable through the config system
- Settings stored in `config/featherclient/`

## 🎮 Performance Tips for Low-End PCs

```
Game Settings:
- Render Distance: 6-8 chunks
- Graphics: Fast
- Clouds: Off
- Animations: Minimum
- Particles: Decreased
- Entity Shadows: Off
- Smooth Lighting: Off
- V-Sync: Off
- Max Framerate: Unlimited

Java Launch Arguments:
-Xmx1G -Xms512M -XX:+UnlockExperimentalVMOptions 
-XX:G1NewCollectionThresholdPercent=30 -XX:G1MaxNewCollectionLength=800000000
```

## 🎨 HUD Themes

The client uses a clean, minimal design similar to official Feather Client:
- Dark background with transparency
- Accent colors (purple, green, yellow for status)
- Readable font rendering
- Minimal visual clutter

## 🔧 Keybinds

- `F6` - Toggle HUD visibility (Coming soon)
- `H` - Open HUD Editor (Coming soon)

## 📝 License

MIT License - See [LICENSE](LICENSE) for details

## 🤝 Contributing

Contributions are welcome!
- Found a bug? Open an [issue](https://github.com/Chayanno/FeatherClient-1.16.5/issues)
- Have an idea? Submit a pull request
- Want to help? Check [CONTRIBUTING.md](CONTRIBUTING.md)

## ⚠️ Disclaimer

This client is designed for cracked Minecraft and low-end PC optimization. Use responsibly and follow the rules of the servers you play on.

---

**Made with ❤️ for low-end PC gamers**