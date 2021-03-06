/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.webank.webase.transaction.trans;

import com.webank.webase.transaction.base.ConstantCode;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

@Data
public class ReqTransCallInfo {
    @NotNull(message = ConstantCode.GROUP_ID_IS_EMPTY)
    private int groupId;
    @NotBlank(message = ConstantCode.UUID_DEPLOY_IS_EMPTY)
    private String uuidDeploy;
    private List<Object> contractAbi;
    @NotBlank(message = ConstantCode.FUNCTION_NAME_IS_EMPTY)
    private String funcName;
    private List<Object> funcParam = new ArrayList<>();
}
