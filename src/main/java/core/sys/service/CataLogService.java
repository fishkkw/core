package core.sys.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONObject;

public interface CataLogService {

	public List<JSONObject> selectCataLogByMchIdShow(String mchId);

	public boolean insertSelective(MultipartFile file, String name, String sort, String remark);

}
