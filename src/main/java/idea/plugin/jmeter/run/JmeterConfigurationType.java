package idea.plugin.jmeter.run;

import javax.swing.*;

import org.jetbrains.annotations.NotNull;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import com.intellij.execution.configurations.ConfigurationTypeUtil;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.openapi.project.Project;
import idea.plugin.jmeter.JmeterFileType;

public class JmeterConfigurationType implements ConfigurationType {
	
	private ConfigurationFactory myConfigurationFactory;
	
	public JmeterConfigurationType() {
		myConfigurationFactory = new ConfigurationFactory(this) {
			@Override
			public RunConfiguration createTemplateConfiguration(Project project) {
				return new JmeterRunConfiguration(project, this);
			}
		};
	}
	
	public static JmeterConfigurationType getInstance() {
		return ConfigurationTypeUtil.findConfigurationType(JmeterConfigurationType.class);
	}
	
	@Override
	public String getDisplayName() {
		return "JMeter";
	}
	
	@Override
	public String getConfigurationTypeDescription() {
		return null;
	}
	
	@Override
	public Icon getIcon() {
		return JmeterFileType.FILE_ICON;
	}
	
	@NotNull
	@Override
	public String getId() {
		return getClass().getName();
	}
	
	@Override
	public ConfigurationFactory[] getConfigurationFactories() {
		return new ConfigurationFactory[] { myConfigurationFactory };
	}
	
	public ConfigurationFactory getConfigurationFactory() {
		return myConfigurationFactory;
	}
	
}
