package com.nepxion.discovery.plugin.framework.configuration;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.nepxion.discovery.plugin.framework.context.PluginContainerInitializedHandler;
import com.nepxion.discovery.plugin.framework.context.PluginContextAware;
import com.nepxion.discovery.plugin.framework.controller.PluginRouterController;
import com.nepxion.discovery.plugin.framework.entity.RuleEntity;
import com.nepxion.discovery.plugin.framework.event.PluginPublisher;
import com.nepxion.discovery.plugin.framework.listener.DiscoveryListenerExecutor;
import com.nepxion.discovery.plugin.framework.listener.RegisterListenerExecutor;
import com.nepxion.discovery.plugin.framework.listener.impl.IpAddressFilterDiscoveryListener;
import com.nepxion.discovery.plugin.framework.listener.impl.IpAddressFilterRegisterListener;
import com.nepxion.discovery.plugin.framework.listener.impl.VersionFilterDiscoveryListener;

@Configuration
@ComponentScan(basePackages = { "com.nepxion.discovery.plugin.framework.controller" })
public class PluginAutoConfiguration {
    static {
        System.out.println("");
        System.out.println("╔═══╗");
        System.out.println("╚╗╔╗║");
        System.out.println(" ║║║╠╦══╦══╦══╦╗╔╦══╦═╦╗ ╔╗");
        System.out.println(" ║║║╠╣══╣╔═╣╔╗║╚╝║║═╣╔╣║ ║║");
        System.out.println("╔╝╚╝║╠══║╚═╣╚╝╠╗╔╣║═╣║║╚═╝║");
        System.out.println("╚═══╩╩══╩══╩══╝╚╝╚══╩╝╚═╗╔╝");
        System.out.println("                      ╔═╝║");
        System.out.println("                      ╚══╝");
        System.out.println("Nepxion Discovery  v2.0.10");
        System.out.println("");
    }

    @Bean
    public RestTemplate pluginRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public PluginContainerInitializedHandler pluginContainerInitializedHandler() {
        return new PluginContainerInitializedHandler();
    }

    @Bean
    public PluginContextAware pluginContextAware() {
        return new PluginContextAware();
    }

    @Bean
    public PluginPublisher pluginPublisher() {
        return new PluginPublisher();
    }

    @Bean
    public PluginRouterController pluginRouterController() {
        return new PluginRouterController();
    }

    @Bean
    public RuleEntity ruleEntity() {
        return new RuleEntity();
    }

    @Bean
    public ReentrantReadWriteLock reentrantReadWriteLock() {
        return new ReentrantReadWriteLock();
    }

    @Bean
    public RegisterListenerExecutor registerListenerExecutor() {
        return new RegisterListenerExecutor();
    }

    @Bean
    public DiscoveryListenerExecutor discoveryListenerExecutor() {
        return new DiscoveryListenerExecutor();
    }

    @Bean
    public IpAddressFilterRegisterListener ipAddressFilterRegisterListener() {
        return new IpAddressFilterRegisterListener();
    }

    @Bean
    public IpAddressFilterDiscoveryListener ipAddressFilterDiscoveryListener() {
        return new IpAddressFilterDiscoveryListener();
    }

    @Bean
    public VersionFilterDiscoveryListener versionFilterDiscoveryListener() {
        return new VersionFilterDiscoveryListener();
    }
}