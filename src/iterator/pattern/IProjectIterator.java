package iterator.pattern;

import java.util.Iterator;

/**
 * 如果我要实现一个容器或者其他 API 提供接口时，我一般都自己先写一个接口继承，
 * 然后再继承自己写的接口，保证自己的实现类只用实现自己写的接口（接口传递，当然也要实现顶层的接口），程序阅读也清晰一些
 */
public interface IProjectIterator extends Iterator {
}
