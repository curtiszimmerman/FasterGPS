/*
 * Copyright (C) 2012 Dominik Schürmann <dominik@dominikschuermann.de>
 *
 * This file is part of FasterGPS.
 * 
 * FasterGPS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * FasterGPS is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with FasterGPS.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.fastergps.util;

import org.rootcommands.RootCommands;

public class Constants {
    /*
     * DEBUG enables Log.d outputs, wrapped in org.adaway.util.Log and RootCommands Debug Mode
     */
    public static final boolean DEBUG = false;
    public static final boolean DEBUG_DISABLE_ROOT_CHECK = false;

    // set RootCommands to debug mode based on FasterGPS
    static {
        RootCommands.DEBUG = DEBUG;
    }

    public static final String TAG = "FasterGPS";

    public static final String LINE_SEPERATOR = System.getProperty("line.separator", "\n");
    public static final String FILE_SEPERATOR = System.getProperty("file.separator", "/");
    public static final String ANDROID_SYSTEM_PATH = System.getProperty("java.home", "/system");

    public static final String GPS_CONF = "gps.conf";
    public static final String GPS_CONF_PATH = ANDROID_SYSTEM_PATH + FILE_SEPERATOR + "etc"
            + FILE_SEPERATOR + GPS_CONF;

    public static final String OLD_GPS_CONF = "old_gps.conf";
}
