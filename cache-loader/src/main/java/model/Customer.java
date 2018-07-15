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

package model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * <code>Customer</code>.
 *
 * @author salvador.gonzalez
 * @version 1.0
 */
public class Customer {

  /** The constant customerId. */
  private final String customerId;

  /** The constant fullName. */
  private final String fullName;

  /** The constant email. */
  private final String email;

  /** The constant phoneNumber. */
  private final String phoneNumber;

  /** The constant birthday. */
  private final String birthday;

  /** The constant customerType. */
  private final Integer customerType;

  /**
   * Creates a new instance of customer.
   *
   * @param customerId customer id
   * @param fullName full name
   * @param email email
   * @param phoneNumber phone number
   * @param birthday birthday
   * @param customerType customer type
   */
  public Customer(String customerId, String fullName, String email, String phoneNumber,
    String birthday, Integer customerType) {

    this.customerId = customerId;
    this.fullName = fullName;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.birthday = birthday;
    this.customerType = customerType;
  }

  /**
   * Gets the customer id.
   *
   * @return customer id
   */
  public String getCustomerId() {

    return customerId;
  }

  /**
   * Gets the full name.
   *
   * @return full name
   */
  public String getFullName() {

    return fullName;
  }

  /**
   * Gets the email.
   *
   * @return email
   */
  public String getEmail() {

    return email;
  }

  /**
   * Gets the phone number.
   *
   * @return phone number
   */
  public String getPhoneNumber() {

    return phoneNumber;
  }

  /**
   * Gets the birthday.
   *
   * @return birthday
   */
  public String getBirthday() {

    return birthday;
  }

  /**
   * Gets the customer type.
   *
   * @return customer type
   */
  public Integer getCustomerType() {

    return customerType;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {

    return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
  }

}
