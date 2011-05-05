/*
 * $Id: 20811 2011-05-05 16:04:20Z porcelli $
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.dynjs.parser;

import com.toolazydogs.aunit.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.toolazydogs.aunit.CoreOptions.*;
import static com.toolazydogs.aunit.Work.parse;
import static com.toolazydogs.aunit.Work.rule;
import static org.junit.Assert.fail;

@RunWith(AntlrTestRunner.class)
public class TestParser {

    @Configuration
    @AppliesTo("test.*")
    public static Option[] configureTest() {
        return options(
                lexer(ES3Lexer.class),
                parser(ES3Parser.class)
        );
    }

    @Test
    public void testVarStatement() throws Exception {
        parse("var x;", rule("variableStatement"));
    }

}