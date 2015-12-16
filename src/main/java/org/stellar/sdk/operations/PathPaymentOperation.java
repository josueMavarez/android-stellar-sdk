package org.stellar.sdk.operations;

import com.google.gson.annotations.SerializedName;

import org.stellar.base.Asset;
import org.stellar.base.AssetTypeNative;
import org.stellar.base.Keypair;

/**
 * Represents PathPayment operation response.
 * @see <a href="https://www.stellar.org/developers/horizon/reference/resources/operation.html" target="_blank">Operation documentation</a>
 * @see org.stellar.sdk.requests.OperationsRequestBuilder
 * @see org.stellar.sdk.Server#operations()
 */
public class PathPaymentOperation extends Operation {
  @SerializedName("amount")
  protected final String amount;
  @SerializedName("source_amount")
  protected final String sourceAmount;
  @SerializedName("from")
  protected final Keypair from;
  @SerializedName("to")
  protected final Keypair to;

  @SerializedName("asset_type")
  protected final String assetType;
  @SerializedName("asset_code")
  protected final String assetCode;
  @SerializedName("asset_issuer")
  protected final String assetIssuer;

  @SerializedName("send_asset_type")
  protected final String sendAssetType;
  @SerializedName("send_asset_code")
  protected final String sendAssetCode;
  @SerializedName("send_asset_issuer")
  protected final String sendAssetIssuer;

  PathPaymentOperation(String amount, String sourceAmount, Keypair from, Keypair to, String assetType, String assetCode, String assetIssuer, String sendAssetType, String sendAssetCode, String sendAssetIssuer) {
    this.amount = amount;
    this.sourceAmount = sourceAmount;
    this.from = from;
    this.to = to;
    this.assetType = assetType;
    this.assetCode = assetCode;
    this.assetIssuer = assetIssuer;
    this.sendAssetType = sendAssetType;
    this.sendAssetCode = sendAssetCode;
    this.sendAssetIssuer = sendAssetIssuer;
  }

  public String getAmount() {
    return amount;
  }

  public String getSourceAmount() {
    return sourceAmount;
  }

  public Keypair getFrom() {
    return from;
  }

  public Keypair getTo() {
    return to;
  }

  public Asset getAsset() {
    if (assetType.equals("native")) {
      return new AssetTypeNative();
    } else {
      Keypair issuer = Keypair.fromAddress(assetIssuer);
      return Asset.createNonNativeAsset(assetCode, issuer);
    }
  }

  public Asset getSendAsset() {
    if (sendAssetType.equals("native")) {
      return new AssetTypeNative();
    } else {
      Keypair issuer = Keypair.fromAddress(sendAssetIssuer);
      return Asset.createNonNativeAsset(sendAssetCode, issuer);
    }
  }
}
