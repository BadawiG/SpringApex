package com.alibou.security.uitil;

public class BaseDTO
{
  private String status = Constants.SUCCESS;
  private String message;
  private Object data;


  public void setData(Object data)
  {
    this.data = data;
  }

  public Object getData()
  {
    return data;
  }

  public void setStatus(String status)
  {
    this.status = status;
  }

  public String getStatus()
  {
    return status;
  }

  public void setMessage(String message)
  {
    this.message = message;
  }

  public String getMessage()
  {
    return message;
  }
  
  public void setErrorStatus()
  {
    setStatus(Constants.ERROR);
  }
  
  public void setInvalidSecurityTokenStatus()
  {
    setStatus(Constants.INVALID_SECURITY_TOKEN);
  }
  
  public void setNavigateStatus()
  {
    setStatus(Constants.NAVIGATE);
  }
}
