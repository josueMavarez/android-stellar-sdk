package org.stellar.sdk.effects;

import org.stellar.base.Keypair;

/**
 * Represents trustline_authorized effect response.
 * @see <a href="https://www.stellar.org/developers/horizon/reference/resources/effect.html" target="_blank">Effect documentation</a>
 * @see org.stellar.sdk.requests.EffectsRequestBuilder
 * @see org.stellar.sdk.Server#effects()
 */
public class TrustlineAuthorizedEffect extends TrustlineAuthorization {
  TrustlineAuthorizedEffect(Keypair trustor, String assetType, String assetCode) {
    super(trustor, assetType, assetCode);
  }
}
