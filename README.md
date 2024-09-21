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
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```
```
        <dependency>
            <artifactId>fmenu_for_1.21</artifactId>
            <groupId>me.fmenu</groupId>
            <version>{version}</version>
        </dependency>
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
# 获取FmenuAPI
实例代码：
```
未完工...
```
