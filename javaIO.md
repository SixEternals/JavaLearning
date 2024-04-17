# 字节流和字符流的区别

## 字节流

字节流处理二进制数据的 多用于处理`图像`/`音频`/`视频`等等 性能较好 但不支持字符编码 要手动设置
命名：xxxStream -- InputStream/OutputStream

其中`InputStream`和`OutputStream`都是基类 还需要进一步实现
他们的实现分别为`FileXXXStream`和`BufferedXXXStream`
将上述 XXX 替换为 Input 和 Output 即可
[点击看图解](./pic/字节流.png)

## 字符流

字符流多用于处理大批文本 而且它提供了对字符编码的支持
命名：`XXXReader`和`XXXWriter`

其中`Reader` `Writer`都是基类 需要实现
其中`XXXStreamReader`和`XXXStreamWriter`系列都是`FileXXX`系列的父类
`BufferedXXX`是单独一个分类
[点击看图解](./pic/字符流.png)

```java
try (OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("example.txt"), "UTF-8")) {
    osw.write("Hello, World!");
    } catch (IOException e) {
        e.printStackTrace();
    }

    try (InputStreamReader isr = new InputStreamReader(new FileInputStream("example.txt"), "UTF-8");
        BufferedReader br = new BufferedReader(isr)) {
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
```
