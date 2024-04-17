# 字节流和字符流的区别

字节流处理二进制数据的 多用于处理`图像`/`音频`/`视频`等等 性能较好 但不支持字符编码 要手动设置
java.io.BufferedReader || java.io.BufferedWriter
字符流多用于处理大批文本 而且它提供了对字符编码的支持
InputStreamReader || OutputStreamWriter 都是将字节流处理为字符流 并支持输入编码格式

```java
catch(OutputStreamWriter writer = new OutputStreamWriter(FileOutputStream("example.txt"),"UTF-8")){
    writer.
}
```
