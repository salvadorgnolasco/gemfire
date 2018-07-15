/* ------------------------------------------------------------------------------------------------
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * ------------------------------------------------------------------------------------------------
 * File name: ServiceOrchestratorBuilder.java
 * Original Author: Salvador Gonzalez N.
 * Creation Date: Jul 8, 2018
 * ------------------------------------------------------------------------------------------------
 */

package loader;

import com.gemstone.gemfire.cache.CacheLoader;
import com.gemstone.gemfire.cache.Declarable;
import com.gemstone.gemfire.cache.LoaderHelper;
import java.util.Properties;

/**
 * <code>SimpleCacheLoader</code>.
 *
 * @author salvador.gonzalez
 * @version 1.0
 */
public class SimpleCacheLoader implements CacheLoader<String, String>, Declarable {

  /**
   * Load.
   *
   * @param helper helper
   * @return string
   */
  @Override
  public String load(LoaderHelper<String, String> helper) {

    String key = helper.getKey();
    System.out.println("    Loader called to retrieve value for " + key);

    // Create a value using the suffix number of the key (key1, key2, etc.)
    return "LoadedValue" + (Integer.parseInt(key.substring(3)));
  }

  /**
   * Close.
   */
  @Override
  public void close() {

    // do nothing
  }

  /**
   * Inits the.
   *
   * @param props props
   */
  @Override
  public void init(Properties props) {

    // do nothing
  }
}
