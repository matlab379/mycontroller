/*
 * Copyright 2015-2016 Jeeva Kandasamy (jkandasa@gmail.com)
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.mycontroller.standalone.db.dao;

import java.util.List;

import org.mycontroller.standalone.api.jaxrs.json.Query;
import org.mycontroller.standalone.api.jaxrs.json.QueryResponse;
import org.mycontroller.standalone.db.tables.UidTag;

/**
 * @author Jeeva Kandasamy (jkandasa)
 * @since 0.0.1
 */
public interface UidTagDao extends BaseDao<UidTag, Integer> {
    void deleteBySensorVariableIds(List<Integer> sVariableIds);

    void deleteBySensorId(Integer sId);

    void deleteByUId(Integer uid);

    UidTag getBySensorVariableId(Integer sVariableId);

    UidTag getByUId(String uid);

    QueryResponse getAll(Query query);

}
