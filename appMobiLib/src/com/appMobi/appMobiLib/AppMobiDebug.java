package com.appMobi.appMobiLib;
/* License (MIT)
 * Copyright (c) 2008 Nitobi
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * Software), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED AS IS, WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
import com.appMobi.appMobiLib.util.Debug;
import android.util.Log;

public class AppMobiDebug extends AppMobiCommand {
    
	public AppMobiDebug(AppMobiActivity activity, AppMobiWebView webview){
		super(activity, webview);
    }	

	public void log(String message, String tag) {
		if("undefined".equals(message)) {
			message = "";
		}
		if("undefined".equals(tag)) {
			tag = "[appMobi]";
			message = "AppMobiDebug.log(message):" + message;
		}
		if(Debug.isDebuggerConnected()) Log.d(tag, message);
	}
}
