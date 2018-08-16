package capgemini;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class organisation {
	
	private String Name;
	private address Address;
	private double MarketValue;
	private LocalDate Established;
	private int employeeCount;
	private Set<Integer> globalPresence = new HashSet<>();
	private List<String> boardMembers = new ArrayList<>();
	private Map<String,String> projectManager = new HashMap<>();
	private Properties proxyServerList = new Properties();
	
	public organisation(String name, address address, double marketValue, LocalDate established, int employeeCount,
			Set<Integer> globalPresence, List<String> boardMembers, Map<String, String> projectManager,
			Properties proxyServerList) {
		super();
		Name = name;
		Address = address;
		MarketValue = marketValue;
		Established = established;
		this.employeeCount = employeeCount;
		this.globalPresence = globalPresence;
		this.boardMembers = boardMembers;
		this.projectManager = projectManager;
		this.proxyServerList = proxyServerList;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public address getAddress() {
		return Address;
	}
	public void setAddress(address address) {
		Address = address;
	}
	public double getMarketValue() {
		return MarketValue;
	}
	public void setMarketValue(double marketValue) {
		MarketValue = marketValue;
	}
	public LocalDate getEstablished() {
		return Established;
	}
	public void setEstablished(LocalDate established) {
		Established = established;
	}
	public int getEmployeeCount() {
		return employeeCount;
	}
	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}
	public Set<Integer> getGlobalPresence() {
		return globalPresence;
	}
	public void setGlobalPresence(Set<Integer> globalPresence) {
		this.globalPresence = globalPresence;
	}
	public List<String> getBoardMembers() {
		return boardMembers;
	}
	public void setBoardMembers(List<String> boardMembers) {
		this.boardMembers = boardMembers;
	}
	public Map<String, String> getProjectManager() {
		return projectManager;
	}
	public void setProjectManager(Map<String, String> projectManager) {
		this.projectManager = projectManager;
	}
	public Properties getProxyServerList() {
		return proxyServerList;
	}
	public void setProxyServerList(Properties proxyServerList) {
		this.proxyServerList = proxyServerList;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Address == null) ? 0 : Address.hashCode());
		result = prime * result + ((Established == null) ? 0 : Established.hashCode());
		long temp;
		temp = Double.doubleToLongBits(MarketValue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + ((boardMembers == null) ? 0 : boardMembers.hashCode());
		result = prime * result + employeeCount;
		result = prime * result + ((globalPresence == null) ? 0 : globalPresence.hashCode());
		result = prime * result + ((projectManager == null) ? 0 : projectManager.hashCode());
		result = prime * result + ((proxyServerList == null) ? 0 : proxyServerList.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		organisation other = (organisation) obj;
		if (Address == null) {
			if (other.Address != null)
				return false;
		} else if (!Address.equals(other.Address))
			return false;
		if (Established == null) {
			if (other.Established != null)
				return false;
		} else if (!Established.equals(other.Established))
			return false;
		if (Double.doubleToLongBits(MarketValue) != Double.doubleToLongBits(other.MarketValue))
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (boardMembers == null) {
			if (other.boardMembers != null)
				return false;
		} else if (!boardMembers.equals(other.boardMembers))
			return false;
		if (employeeCount != other.employeeCount)
			return false;
		if (globalPresence == null) {
			if (other.globalPresence != null)
				return false;
		} else if (!globalPresence.equals(other.globalPresence))
			return false;
		if (projectManager == null) {
			if (other.projectManager != null)
				return false;
		} else if (!projectManager.equals(other.projectManager))
			return false;
		if (proxyServerList == null) {
			if (other.proxyServerList != null)
				return false;
		} else if (!proxyServerList.equals(other.proxyServerList))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "organisation [Name=" + Name + ", Address=" + Address + ", MarketValue=" + MarketValue + ", Established="
				+ Established + ", employeeCount=" + employeeCount + ", globalPresence=" + globalPresence
				+ ", boardMembers=" + boardMembers + ", projectManager=" + projectManager + ", proxyServerList="
				+ proxyServerList + "]";
	} 
	
	
	
	
	

}
