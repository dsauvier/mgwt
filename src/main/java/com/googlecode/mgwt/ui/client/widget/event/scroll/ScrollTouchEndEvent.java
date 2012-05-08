/*
 * Copyright 2012 Daniel Kurka
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.googlecode.mgwt.ui.client.widget.event.scroll;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.googlecode.mgwt.dom.client.event.touch.TouchStartEvent;

public class ScrollTouchEndEvent extends GwtEvent<ScrollTouchEndEvent.Handler> {

	public interface Handler extends EventHandler {
		public void onEvent(ScrollTouchEndEvent event);
	}

	private static GwtEvent.Type<ScrollTouchEndEvent.Handler> TYPE = new Type<ScrollTouchEndEvent.Handler>();
	private final TouchStartEvent event;

	public ScrollTouchEndEvent(TouchStartEvent event) {
		this.event = event;

	}

	public static GwtEvent.Type<ScrollTouchEndEvent.Handler> getTYPE() {
		return TYPE;
	}

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<Handler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(Handler handler) {
		handler.onEvent(this);

	}

	public TouchStartEvent getEvent() {
		return event;
	}

}
