package com.iab.gpp.encoder.field;

import java.util.Arrays;
import java.util.List;

public class UsMtV1Field {

  public static String VERSION = "Version";
  public static String SHARING_NOTICE = "SharingNotice";
  public static String SALE_OPT_OUT_NOTICE = "SaleOptOutNotice";
  public static String TARGETED_ADVERTISING_OPT_OUT_NOTICE = "TargetedAdvertisingOptOutNotice";
  public static String SALE_OPT_OUT = "SaleOptOut";
  public static String TARGETED_ADVERTISING_OPT_OUT = "TargetedAdvertisingOptOut";
  public static String SENSITIVE_DATA_PROCESSING = "SensitiveDataProcessing";
  public static String KNOWN_CHILD_SENSITIVE_DATA_CONSENTS = "KnownChildSensitiveDataConsents";
  public static String ADDITIONAL_DATA_PROCESSING_CONSENT = "AdditionalDataProcessingConsent";
  public static String MSPA_COVERED_TRANSACTION = "MspaCoveredTransaction";
  public static String MSPA_OPT_OUT_OPTION_MODE = "MspaOptOutOptionMode";
  public static String MSPA_SERVICE_PROVIDER_MODE = "MspaServiceProviderMode";

  public static String GPC_SEGMENT_TYPE = "GpcSegmentType";
  public static String GPC_SEGMENT_INCLUDED = "GpcSegmentIncluded";
  public static String GPC = "Gpc";
  
  //@formatter:off
  public static List<String> USMTV1_CORE_SEGMENT_FIELD_NAMES = Arrays.asList(new String[] {
      UsMtV1Field.VERSION,
      UsMtV1Field.SHARING_NOTICE,
      UsMtV1Field.SALE_OPT_OUT_NOTICE,
      UsMtV1Field.TARGETED_ADVERTISING_OPT_OUT_NOTICE,
      UsMtV1Field.SALE_OPT_OUT,
      UsMtV1Field.TARGETED_ADVERTISING_OPT_OUT,
      UsMtV1Field.SENSITIVE_DATA_PROCESSING,
      UsMtV1Field.KNOWN_CHILD_SENSITIVE_DATA_CONSENTS,
      UsMtV1Field.ADDITIONAL_DATA_PROCESSING_CONSENT,
      UsMtV1Field.MSPA_COVERED_TRANSACTION,
      UsMtV1Field.MSPA_OPT_OUT_OPTION_MODE,
      UsMtV1Field.MSPA_SERVICE_PROVIDER_MODE
  });
  //@formatter:on
  
  //@formatter:off
  public static List<String> USMTV1_GPC_SEGMENT_FIELD_NAMES = Arrays.asList(new String[] {
      UsMtV1Field.GPC_SEGMENT_TYPE,
      UsMtV1Field.GPC
  });
  //@formatter:on
}
