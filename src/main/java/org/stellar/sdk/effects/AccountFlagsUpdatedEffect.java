package org.stellar.sdk.effects;

import com.google.gson.annotations.SerializedName;

/**
 * Represents account_flags_updated effect response.
 * @see <a href="https://www.stellar.org/developers/horizon/reference/resources/effect.html" target="_blank">Effect documentation</a>
 * @see org.stellar.sdk.requests.EffectsRequestBuilder
 * @see org.stellar.sdk.Server#effects()
 */
public class AccountFlagsUpdatedEffect extends Effect {
  @SerializedName("auth_required_flag")
  protected final Boolean authRequiredFlag;
  @SerializedName("auth_revokable_flag")
  protected final Boolean authRevokableFlag;

  AccountFlagsUpdatedEffect(Boolean authRequiredFlag, Boolean authRevokableFlag) {
    this.authRequiredFlag = authRequiredFlag;
    this.authRevokableFlag = authRevokableFlag;
  }

  public Boolean getAuthRequiredFlag() {
    return authRequiredFlag;
  }

  public Boolean getAuthRevokableFlag() {
    return authRevokableFlag;
  }
}
