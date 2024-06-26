package com.shumujin.weblog.web.controller;

import com.shumujin.weblog.common.aspect.ApiOperationLog;
import com.shumujin.weblog.common.domain.dos.UserDO;
import com.shumujin.weblog.common.utils.JsonUtil;
import com.shumujin.weblog.common.utils.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@Api(tags = "首页模块")
public class TestController {

    private static final Logger logs = LoggerFactory.getLogger(TestController.class);

    @PostMapping("/admin/test")
    @ApiOperationLog(description = "测试接口")
    @ApiOperation(value = "测试接口")
    public Response test(@RequestBody @Validated UserDO userDO) {
        logs.info(JsonUtil.toJsonString(userDO));

        return Response.fail();
    }

    @PostMapping("/login")
    @ApiOperationLog(description = "测试登录接口")
    @ApiOperation(value = "测试登录接口")
    public Response login(@RequestBody @Validated UserDO userDO) {
        logs.info(JsonUtil.toJsonString(userDO));
        return Response.fail();
    }

    @PostMapping("/admin/update")
    @ApiOperationLog(description = "测试更新接口")
    @ApiOperation(value = "测试更新接口")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public Response testUpdate() {
        log.info("更新成功...");
        return Response.success();
    }
}
