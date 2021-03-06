/**
 * 桥接模式
 * 桥接模式是一种常见的类与类之间组合的关系,通过组合来进行解藕.
 * 主要用于处理多维度变化.比如应该没有要绘制一个图形(正方形,圆形,椭圆),绘制的图形是有颜色的比如(红色,绿色),这里就有了两个纬度
 * 如果不用组合关系,代码的设计可能会将图形和颜色柔和在一个类中,但实质上这是两个维度,他们之间耦合关系,只有组合,因此,使用组合
 * 便能更好的降低耦合度,增加代码的扩展性.
 * Created by crazystone on 18-2-8.
 */
package study.crazystone.me.bridge;