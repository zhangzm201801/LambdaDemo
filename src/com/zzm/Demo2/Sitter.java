package com.zzm.Demo2;

/*
 * 保姆接口
 */
@FunctionalInterface
public interface Sitter {
	// 保姆的工作：把生米做成熟饭
	public void work(String food);
}
