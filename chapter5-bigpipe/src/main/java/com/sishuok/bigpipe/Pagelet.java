/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.sishuok.bigpipe;

import javax.servlet.http.HttpServletResponse;

/**
 * @author Zhang Kaitao
 * @date 13-7-28 下午8:19
 * @version 1.0
 */
public interface Pagelet {

    PageletResult run(final BigPipeContext context, final HttpServletResponse response);

}
