package com.iab.gpp.encoder.field;

import java.util.Arrays;
import java.util.List;

public class UsCoField {

  public static String VERSION = "Version";
  public static String SHARING_NOTICE = "SharingNotice";
  public static String SALE_OPT_OUT_NOTICE = "SaleOptOutNotice";
  public static String TARGETED_ADVERTISING_OPT_OUT_NOTICE = "TargetedAdvertisingOptOutNotice";
  public static String SALE_OPT_OUT = "SaleOptOut";
  public static String TARGETED_ADVERTISING_OPT_OUT = "TargetedAdvertisingOptOut";
  public static String SENSITIVE_DATA_PROCESSING = "SensitiveDataProcessing";
  public static String KNOWN_CHILD_SENSITIVE_DATA_CONSENTS = "KnownChildSensitiveDataConsents";
  public static String MSPA_COVERED_TRANSACTION = "MspaCoveredTransaction";
  public static String MSPA_OPT_OUT_OPTION_MODE = "MspaOptOutOptionMode";
  public static String MSPA_SERVICE_PROVIDER_MODE = "MspaServiceProviderMode";

  public static String GPC_SEGMENT_TYPE = "GpcSegmentType";
  public static String GPC_SEGMENT_INCLUDED = "GpcSegmentIncluded";
  public static String GPC = "Gpc";
  
  //@formatter:off
  public static List<String> USCO_CORE_SEGMENT_FIELD_NAMES = Arrays.asList(new String[] {
      UsCoField.VERSION,
      UsCoField.SHARING_NOTICE,
      UsCoField.SALE_OPT_OUT_NOTICE,
      UsCoField.TARGETED_ADVERTISING_OPT_OUT_NOTICE,
      UsCoField.SALE_OPT_OUT,
      UsCoField.TARGETED_ADVERTISING_OPT_OUT,
      UsCoField.SENSITIVE_DATA_PROCESSING,
      UsCoField.KNOWN_CHILD_SENSITIVE_DATA_CONSENTS,
      UsCoField.MSPA_COVERED_TRANSACTION,
      UsCoField.MSPA_OPT_OUT_OPTION_MODE,
      UsCoField.MSPA_SERVICE_PROVIDER_MODE
  });
  //@formatter:on
  
  //@formatter:off
  public static List<String> USCO_GPC_SEGMENT_FIELD_NAMES = Arrays.asList(new String[] {
      UsCoField.GPC_SEGMENT_TYPE,
      UsCoField.GPC
  });
  //@formatter:on
}