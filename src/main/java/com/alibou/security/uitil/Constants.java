package com.alibou.security.uitil;

public interface Constants
{
  //general
  String SETTINGS_KEY = "SETTINGS_KEY";
  String USER_KEY = "userKey";
  String LANG_AR = "ar";
  String LANG_EN = "en";
  int SECURITY_TOKEN_LENGTH = 50;
  int CODE_LENGTH = 4;
  //int PAGE_SIZE = 10;
  String DELIMETER_SAME_LINE = "\t";
  String DELIMETER_NEW_LINE = "\n";
  String DATE_FORMAT = "dd/MM/yyyy";
  String DATE_TIME_FORMAT = DATE_FORMAT + " HH:mm:ss";

  //status
  String ERROR = "E";
  String SUCCESS = "S";
  String INVALID_SECURITY_TOKEN = "I";
  String NAVIGATE = "N";

  //lookups
  int GENDER = 1;
  int LANGUAGE = 2;
  int PAYMENT_METHOD = 5;

  //lookup values
  int LOOKUP_ARABIC_LANG = 3;
  int LOOKUP_ENGLISH_LANG = 4;
  int LOOKUP_MESSAGE_STATUS_NEW = 5;
  int LOOKUP_MESSAGE_STATUS_REPLY_DONE = 6;

  //user types
  int USER_TYPE_ADMIN = 1;
  int USER_TYPE_USER = 2;

  //messages
  int MESSAGE_FORGOT_PASSWORD = 1;
  int MESSAGE_ACTIVATE_USER = 2;

  //order status
  int ORDER_STATUS_NEW = 7;
  int ORDER_STATUS_CASHIER = 8;
  int ORDER_STATUS_KITCHEN = 9;
  int ORDER_STATUS_WRAP = 10;
  int ORDER_STATUS_READY = 11;
  int ORDER_STATUS_DELIVERED = 12;
  int ORDER_STATUS_CANCELLED = 13;

  //languages code
  String ARABIC_LANG_CODE = "ar";
  String ENGLISH_LANG_CODE = "en";

  // sorting by
  int BRANCHES_RATING = 14;
  int BRANCHES_DISTANCE = 15;
  int BRANCHES_NEWEST = 16;
  
  // Reports
  String JASPER_REP_PATH = "jasperRepPath";
  String JASPER_REPORT_MAP_PARAM = "jasperReportMapParam";
  String JASPER_CONNECTION_PARAM = "jasperConnectionParam";
  String REPORT_TYPE_PARAM_KEY = "jaspeReportTypeParamKey";
  String PDF_REPORT = "PDF";
  String NO_MIRROR = "NO_MIRROR";

 // user Types
 int ADMIN_USER = 1;
 int NORMAL_USER = 2;
 int MAINTENANCE = 3;

}

