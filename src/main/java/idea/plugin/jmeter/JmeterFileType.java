package idea.plugin.jmeter;

import javax.swing.*;

import org.jetbrains.annotations.NotNull;

import com.intellij.lang.xml.XMLLanguage;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.IconLoader;
import com.intellij.openapi.vfs.CharsetToolkit;
import com.intellij.openapi.vfs.VirtualFile;

public class JmeterFileType extends LanguageFileType {
	
	public static final JmeterFileType INSTANCE = new JmeterFileType();
	public static final Icon FILE_ICON = IconLoader.getIcon("/icons/beaker.png");
	
	public JmeterFileType() {
		super(XMLLanguage.INSTANCE);
	}
	
	@NotNull
	@Override
	public String getName() {
		return "JMeter";
	}
	
	@NotNull
	@Override
	public String getDescription() {
		return "JMeter files";
	}
	
	@NotNull
	@Override
	public String getDefaultExtension() {
		return "jmx";
	}
	
	@Override
	public Icon getIcon() {
		return FILE_ICON;
	}
	
	@Override
	public String getCharset(@NotNull VirtualFile virtualFile, byte[] bytes) {
		return CharsetToolkit.UTF8;
	}
	
}
