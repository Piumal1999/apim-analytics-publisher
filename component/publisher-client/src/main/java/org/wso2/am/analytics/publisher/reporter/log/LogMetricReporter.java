/*
 * Copyright (c) 2021, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.am.analytics.publisher.reporter.log;

import org.wso2.am.analytics.publisher.exception.MetricCreationException;
import org.wso2.am.analytics.publisher.reporter.AbstractMetricReporter;
import org.wso2.am.analytics.publisher.reporter.CounterMetric;
import org.wso2.am.analytics.publisher.reporter.MetricSchema;
import org.wso2.am.analytics.publisher.reporter.TimerMetric;

import java.util.Map;

/**
 * Log Metric Reporter class. Intended for testing only.
 */
public class LogMetricReporter extends AbstractMetricReporter {

    public LogMetricReporter(Map<String, String> properties) throws MetricCreationException {
        super(properties);
    }

    @Override protected void validateConfigProperties(Map<String, String> properties) throws MetricCreationException {
        //nothing to validate
    }

    @Override protected CounterMetric createCounter(String name, MetricSchema schema) {
        return new LogCounterMetric(name);
    }

    @Override protected TimerMetric createTimer(String name) {
        return null;
    }
}
