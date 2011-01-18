/*
    Copyright 2011, Strategic Gains, Inc.

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/
package com.strategicgains.restexpress.route.regex;

import java.lang.reflect.Method;

import org.jboss.netty.handler.codec.http.HttpMethod;

import com.strategicgains.restexpress.route.Route;
import com.strategicgains.restexpress.route.RouteBuilder;

/**
 * @author toddf
 * @since Jan 13, 2011
 */
public class RegexRouteBuilder
extends RouteBuilder
{
	/**
	 * @param uri
	 * @param controller
	 * @param routeType
	 */
	public RegexRouteBuilder(String uri, Object controller)
	{
		super(uri, controller);
	}

    @Override
    protected Route newRoute(String pattern, Object controller, Method action,
        HttpMethod method, boolean shouldSerializeResponse, String name)
    {
    	return new RegexRoute(pattern, controller, action, method, shouldSerializeResponse, name);
    }
}