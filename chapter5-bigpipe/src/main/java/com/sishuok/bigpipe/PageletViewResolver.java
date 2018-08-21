/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.sishuok.bigpipe;

/**
 * @author Zhang Kaitao
 * @date 13-8-4 上午9:07
 * @version 1.0
 */
public interface PageletViewResolver {

    /**
     * 暂时没考虑国际化
     * @param pageletResult
     */
    PageletView resolve(PageletResult pageletResult);
}
