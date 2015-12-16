package org.stellar.sdk.effects;

/**
 * Represents signer_created effect response.
 * @see <a href="https://www.stellar.org/developers/horizon/reference/resources/effect.html" target="_blank">Effect documentation</a>
 * @see org.stellar.sdk.requests.EffectsRequestBuilder
 * @see org.stellar.sdk.Server#effects()
 */
public class SignerCreatedEffect extends SignerEffect {
  SignerCreatedEffect(Integer weight, String publicKey) {
    super(weight, publicKey);
  }
}
