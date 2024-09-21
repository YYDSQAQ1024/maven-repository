# 前言
此仓库为Maven库
# 使用Maven导入
> [!WARNING]
> FmenuAPI仅支持1.21版本及以上！

将下方代码放入***pom.yml***来导入Fmenu\
将`{version}`替换为插件实际版本
```
    <repositories>
        <repository>
            <id>fmenu</id>
            <url>https://github.com/YYDSQAQ1024/maven-repository/raw/main/fmenu-release</url>
        </repository>
    </repositories>
```
```
    <dependencies>
        <dependency>
            <artifactId>fmenu_for_1.21</artifactId>
            <groupId>me.fmenu</groupId>
            <version>{version}</version><!--Replace {version} with the Fmenu version-->
        </dependency>
    </dependencies>
```

# 将Fmenu设为依赖
- `plugin.yml`
```
name: ExamplePlugin
version: 1.0
author: null
main: your.main.path.Here

# 将Fmenu作为软依赖
softdepend: [Fmenu-1.21]
```
+ `paper-plugin.yml`
```
name: ExamplePlugin
version: 1.0
author: null
main: your.main.path.Here

dependencies:
  server:
    Fmenu-1.21:
      # 使插件在Fmenu加载后再加载
      load: BEFORE
      required: false
```
# 使用FmenuAPI
## 获取API
示例代码：
```
package com.example.Example;

import me.fmenu.fmenu.Fmenu;
import me.fmenu.fmenu.api.FmenuAPI;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Example extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Fmenu fmenu = (Fmenu) Bukkit.getPluginManager().getPlugin("Fmenu-1.21");
        if (fmenu != null) {
            FmenuAPI api = fmenu.getAPI();
            api.getVersion();//Get Fmenu version
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
```
## 打开菜单
```
FmenuAPI api = fmenu.getAPI();

/**
* Open a menu for a Java Edition player.
*
* @apiNote This method is only available to Java Edition players.
*
* @param player Player to view the menu.
* @param name The menu file name,no need for a file suffix.
*/
api.openFmenu(player,name);
```
# 监听事件
常用事件：
- PlayerClickFmenuEvent
- PlayerOpenFmenuEvent