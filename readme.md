#  springboot-mui  
springboot as server interface  
mui as mobile client  
  
#  遇到问题  
mui在移动设备中不存在ajax跨域访问的问题，但是在PC浏览器调试的时候，就有跨域访问的问题，所以Springboot服务将跨域访问打开了。  
实际环境中处于安全考虑当关闭，不影响移动设备中的使用。  