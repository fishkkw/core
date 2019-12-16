package core.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import core.sys.service.CataLogService;
import core.util.Msg;
import core.util.ParamCheckUtil;

@RestController
@RequestMapping("/catalog")
public class CataLogController {
	
	@Autowired
	private CataLogService cataLogService;
	
	@RequestMapping(value = "/getcatalogbymchId", method = RequestMethod.GET)
	public Msg getCataLogByMchIdShow(@RequestParam String mchId) throws Exception {
		if(ParamCheckUtil.isBlank(mchId)) {
			return Msg.fail("参数异常");
		}
		return Msg.success(cataLogService.selectCataLogByMchIdShow(mchId));
	}

	@RequestMapping(value = "/addcatalog", method = RequestMethod.POST)
	public Msg addCataLog(@RequestParam(value = "file", required = true) MultipartFile file,
			@RequestParam(value = "name", required = true) String name,
			@RequestParam(value = "sort", required = true) String sort,
			@RequestParam(value = "remark", required = true) String remark) throws Exception {
		/**
		 * 1.文件类型校验后缀名。jpg png 之类
		 * 2.文件校验大小 
		 * 3.商品分类名称校验 3.1 是否存在 3.2 是否合规 只能输入中英文长度不大于限定值
		 * 4.sort 序号？ 如果前端能够提供 省很多事情 校验数字 三位 合规 
		 * 5.id 主键生成待定。UUID36位。可自增 可自定义生成唯一标识
		 * 6.remark 备注 只允许中英文+，。（）{}[]
		 * 7.预留文件压缩 
		 * 8.Environment.getAccount() 从环境中获取账号信息 固定写死ceshizhanghao 
		 * 9.Environment.getMerchId() 从环境中获取商户信息 现固定写死XXXX-XXX-XXXX
		 * 10.前后端参数校验一致，后天异常返回给前端 可优化至让前端直接弹出框 异常信息 例如：Msg.fail("名称重复")
		 * Msg.fail("参数校验不通过") 
		 * 11 后台启动swagger地址 http://localhost:8080/swagger-ui.html#!/
		 */
		if(ParamCheckUtil.checkName(name)) {
			return Msg.fail("11111111111111");
		}
		if(cataLogService.insertSelective(file, name, sort, remark)) {
			return Msg.success();
		} else {
			return Msg.fail();
		}
	}
}
